package com.mfgustavo.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.mfgustavo.nearby.data.model.Market
import com.mfgustavo.nearby.ui.route.Home
import com.mfgustavo.nearby.ui.route.QRCodeScanner
import com.mfgustavo.nearby.ui.route.Splash
import com.mfgustavo.nearby.ui.route.Welcome
import com.mfgustavo.nearby.ui.screen.home.HomeScreen
import com.mfgustavo.nearby.ui.screen.home.HomeViewModel
import com.mfgustavo.nearby.ui.screen.market_details.MarketDetailsScreen
import com.mfgustavo.nearby.ui.screen.market_details.MarketDetailsUiEvent
import com.mfgustavo.nearby.ui.screen.market_details.MarketDetailsViewModel
import com.mfgustavo.nearby.ui.screen.qrcode_scanner.QRCodeScannerScreen
import com.mfgustavo.nearby.ui.screen.splash.SplashScreen
import com.mfgustavo.nearby.ui.screen.welcome.WelcomeScreen
import com.mfgustavo.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NearbyTheme {
                val navController = rememberNavController()

                val homeViewModel by viewModels<HomeViewModel>()
                val homeUiState by homeViewModel.uiState.collectAsStateWithLifecycle();

                val marketDetailsViewModel by viewModels<MarketDetailsViewModel>()
                val marketDetailsUiState by marketDetailsViewModel.uiState.collectAsStateWithLifecycle();

                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(
                            onNavigateToWelcome = {
                                navController.navigate(Welcome)
                            }
                        )
                    }

                    composable<Welcome> {
                        WelcomeScreen(
                            onNavigateToHome = {
                                navController.navigate(Home)
                            }
                        )
                    }

                    composable<Home> {
                        HomeScreen(
                            onNavigateToMarketDetails = { selectedMarket ->
                                navController.navigate(selectedMarket)
                            },
                            uiState = homeUiState,
                            onEvent = homeViewModel::onEvent
                        )
                    }

                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()

                        MarketDetailsScreen(
                            market = selectedMarket,
                            uiState = marketDetailsUiState,
                            onEvent = marketDetailsViewModel::onEvent,
                            onNavigateBack = {
                                navController.popBackStack()
                            },
                            toNavigateToQRCodeScanner = {
                                navController.navigate(QRCodeScanner)
                            }
                        )
                    }

                    composable<QRCodeScanner> {
                        QRCodeScannerScreen(
                            onCompletedScan = { qrCodeContent ->
                                if (qrCodeContent.isNotEmpty()) {
                                    marketDetailsViewModel.onEvent(
                                        MarketDetailsUiEvent.OnFetchCoupon(
                                            qrCodeContent = qrCodeContent
                                        )
                                    )
                                }

                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}
