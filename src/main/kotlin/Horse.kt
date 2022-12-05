class Horse(name: String, location: String, food: String) : Animal(name, location, food) {
    override fun makeNoise() {
        println("Neigh!")
    }

    override fun sleep() {
        println("This horse sleeps.")
    }
}