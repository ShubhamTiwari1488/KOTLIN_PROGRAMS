fun main() {

    val listView = ListView(arrayOf("Shubham", "Mohit", "Anshu", "Daksh"))

    listView.ListViewItems().displayItem(2)

}

class ListView(val items: Array<String>) {

    inner class ListViewItems() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}