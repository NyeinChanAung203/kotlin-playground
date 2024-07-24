fun main(){
    val listView = ListView(listOf("item 1","item 2","item 3","item 4","item 5"))
    listView.ListViewItem().display(2)
}

class ListView(var items: List<String>){

    inner class ListViewItem{
        fun display(position: Int): String{
            println( items[position])
            return items[position]
        }
    }
}