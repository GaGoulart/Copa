package com.has.copa.data
import com.has.copa.R
import com.has.copa.model.Escalacao

class Datasource {
    fun loadEscalacao(): List<Escalacao> {
        return listOf<Escalacao>(
            Escalacao(R.string.jogador1, R.drawable.goleiro_holanda),
            Escalacao(R.string.jogador2, R.drawable._2),
            Escalacao(R.string.jogador3, R.drawable.virgil_holanda1),
            Escalacao(R.string.jogador4, R.drawable._23),
            Escalacao(R.string.jogador5, R.drawable._234),
            Escalacao(R.string.jogador6, R.drawable._435),
            Escalacao(R.string.jogador7, R.drawable._2),
            Escalacao(R.string.jogador8, R.drawable._2),
            Escalacao(R.string.jogador9, R.drawable._2),
            Escalacao(R.string.jogador10, R.drawable._2),
            Escalacao(R.string.jogador11, R.drawable._2),
            Escalacao(R.string.jogador12, R.drawable._2)
        )
    }
}