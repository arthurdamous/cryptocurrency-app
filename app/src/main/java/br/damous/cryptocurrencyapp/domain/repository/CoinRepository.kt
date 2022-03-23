package br.damous.cryptocurrencyapp.domain.repository

import br.damous.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import br.damous.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}