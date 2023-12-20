package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val monster = SuperMonster(100, 9)
    val knight = SuperKnight(140, 11)
    monster.attack(knight)
    monster.attack(knight, 5)

}

open class JuniorKnight(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 체력은 $hp")
        } else {
            println("기사가 죽었습니다")
        }
    }

    private fun heal() {
        hp += 3
    }
}

open class JuniorMonster(private var hp: Int, private var power: Int) {
    fun attack(knight: Knight) {
        knight.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("몬스터의 체력은 $hp")
        } else {
            println("몬스터가 죽었습니다")
        }
    }
}

open class Character(var hp: Int, val power: Int) {
    fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")
        else println("사망 했습니다")
    }
}

class SuperKnight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}

class SuperMonster(hp: Int, power: Int) : Character(hp, power) {
    fun bite(character: Character) {
        super.attack(character, power + 2)
    }
}