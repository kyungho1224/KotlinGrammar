package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val knight = Knight(20, 4)
    val monster = Monster(15, 3)

    knight.attack(monster)
    monster.attack(knight)

}

class Knight(private var hp: Int, private var power: Int) {
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

class Monster(private var hp: Int, private var power: Int) {
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