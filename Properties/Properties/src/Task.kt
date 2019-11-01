class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set (v: Int?) {
            field = v
            counter ++
        }
}

//var stringRepresentation: String
//    get() = this.toString()
//    set(value) {
//        setDataFromString(value) // parses the string and assigns values to other properties
//    }