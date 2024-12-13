package com.mfgustavo.nearby.ui.screen.market_details

import com.mfgustavo.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)