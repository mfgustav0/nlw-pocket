package com.mfgustavo.nearby.data.model.mock

import com.mfgustavo.nearby.data.model.Market
import com.mfgustavo.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "0023402-23-23412342-234",
        categoryId = "5678-ghi-8976543",
        name = "Padaria Delícia",
        description = "Padaria artesanal com pães quentinhos, bolos caseiros e cafés especiais. Um espaço aconchegante para todos.",
        coupons = 5,
//        rules = listOf(
//            Rule(
//                id = "1",
//                description = "Válido até o dia 25/12",
//                marketId = "0023402-23-23412342-234"
//            ),
//            Rule(
//                id = "1",
//                description = "Disponível apenas para consumo local",
//                marketId = "0023402-23-23412342-234"
//            )
//        ),
        latitude = -22.98765432123456,
        longitude = -47.12345678912345,
        address = "Rua das Flores, 987 - Jardim das Rosas",
        phone = "(12) 93456-7890",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "0034503-34-34523453-345",
        categoryId = "9101-jkl-1245789",
        name = "CinePrime",
        description = "Cinema de última geração com salas confortáveis e som imersivo. Experimente o verdadeiro cinema.",
        coupons = 2,
//        rules = emptyList(),
        latitude = -23.56891234567891,
        longitude = -46.65878912345678,
        address = "Shopping Center - Piso 3, Loja 45",
        phone = "(11) 91234-5678",
        cover = "https://images.unsplash.com/photo-1551218808-94e220e084d2?w=400&h=300"
    )
)