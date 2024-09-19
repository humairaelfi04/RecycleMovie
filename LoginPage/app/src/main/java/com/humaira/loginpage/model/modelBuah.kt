package com.humaira.loginpage.model

import com.humaira.loginpage.R

class modelBuah(
    val image: Int,
    val judul: String
)

//kita bikin array

object Mocklist {
    fun getModel(): List<modelBuah> {
        val item1 = modelBuah(
            R.drawable.apple,
            "Apel"
        )
        val item2 = modelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val item3 = modelBuah(
            R.drawable.orange,
            "Jeruk"
        )
        val item4 = modelBuah(
            R.drawable.pear,
            "Pir"
        )
        val item5 = modelBuah(
            R.drawable.strawberry,
            "Strawberry"
        )
        val item6 = modelBuah(
            R.drawable.apple,
            "Apel"
        )

        val itemList: ArrayList<modelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList
    }
}