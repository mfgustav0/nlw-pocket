package com.mfgustavo.nearby.data.model

import androidx.annotation.DrawableRes
import com.mfgustavo.nearby.R

enum class NearbyCategoryFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    ALIMENTACAO(description = "Alimentação", icon = R.drawable.ic_tools_kitchen_2),
    COMPRAS(description = "Compras", icon = R.drawable.ic_shopping_bag),
    HOSPEDAR(description = "Hospedar", icon = R.drawable.ic_bed),
    SUPERMERCADO(description = "Supermercado", icon = R.drawable.ic_shopping_cart),
    CINEMA(description = "Cinema", icon = R.drawable.ic_movie),
    FAMACIA(description = "Farmácia", icon = R.drawable.ic_first_aid_kit),
    COMBUSTIVEL(description = "Combustivel", icon = R.drawable.ic_gas_station),
    PADARIA(description = "Padaria", icon = R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): NearbyCategoryFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}