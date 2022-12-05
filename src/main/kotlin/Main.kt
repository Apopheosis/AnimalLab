fun main() {
    val animals: Array<Animal> = arrayOf(Cat("Murzik", "Home", "Whiskas"),
    Dog("Sharik", "Street", "Bones"),
    Horse("Plotva", "Field", "Carrot"))
    val vet = Vet()
    for(animal in animals) {
        vet.treatAnimal(animal)
    }
}