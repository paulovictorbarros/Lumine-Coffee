package com.pvbcsoft.luminecoffee

import com.pvbcsoft.luminecoffee.model.Characters

class DataSourceCharacters {
    companion object {

        fun characterDataSet(): ArrayList<Characters> {
            val charactersList = ArrayList<Characters>()
            charactersList.add(
                Characters(
                    "https://static.wikia.nocookie.net/gensin-impact/images/3/30/Albedo_Icon.png/revision/latest?cb=20210213163457",
                    "https://i.postimg.cc/Dzt8dZV5/item-card-5-stars.png",
                    "https://paimon.moe/images/elements/geo.png",
                    "Albedo"
                )
            )
            charactersList.add(
                Characters(

                    "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest?cb=20230118023048",
                    "https://i.postimg.cc/Dzt8dZV5/item-card-5-stars.png",
                    "https://paimon.moe/images/elements/dendro.png",
                    "Alhaitham"
                )
            )
            charactersList.add(
                Characters(

                    "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest?cb=20220210041444",
                    "https://i.postimg.cc/Dzt8dZV5/item-card-5-stars.png",
                    "https://paimon.moe/images/elements/cryo.png",
                    "Aloy"
                )
            )
            charactersList.add(
                Characters(
                    "https://static.wikia.nocookie.net/gensin-impact/images/7/75/Amber_Icon.png/revision/latest?cb=20210213161233",
                    "https://i.postimg.cc/jjX37hxK/item-card-4-stars-1.png",
                    "https://paimon.moe/images/elements/pyro.png",
                    "Amber"
                )
            )
            charactersList.add(
                Characters(

                    "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest?cb=20230118023048",
                    "https://i.postimg.cc/Dzt8dZV5/item-card-5-stars.png",
                    "https://paimon.moe/images/elements/dendro.png",
                    "Alhaitham"
                )
            )
            charactersList.add(
                Characters(

                    "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Kaedehara_Kazuha_Icon.png/revision/latest?cb=20210623063513",
                    "https://i.postimg.cc/Dzt8dZV5/item-card-5-stars.png",
                    "https://paimon.moe/images/elements/anemo.png",
                    "Kaedehara Kazuha"
                )
            )
            return charactersList
        }
    }
}