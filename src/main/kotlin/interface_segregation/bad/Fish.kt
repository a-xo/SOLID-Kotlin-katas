package interface_segregation.bad

class Fish : Animal {
    override fun nameOfAnimal(): String? {
        return "fish"
    }

    override fun walk(): String? {
        return null
    }

    override fun fly(): String? {
        return null
    }

    override fun swim(): String? {
        return "the " + nameOfAnimal() + " is swimming!"
    }

    override fun bark(): String? {
        return null
    }

    override fun quack(): String? {
        return null
    }

    override fun meow(): String? {
        return null
    }
}