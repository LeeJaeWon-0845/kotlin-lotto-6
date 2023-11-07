package lotto

import camp.nextstep.edu.missionutils.Console

class InputManager {
    fun inputMoney(): Int {
        println(PRINT_INPUT_MONEY)
        return Console.readLine().toInt()
    }

    fun inputWinningNumber(): List<Int> {
        println(PRINT_INPUT_WINNING_NUMBER)
        val nums = Console.readLine().split(DELIMITER)
        println()
        return nums.map { it.toInt() }
    }

    fun inputBonusNumber(): Int {
        println(PRINT_INPUT_BONUS_NUMBER)
        val num = Console.readLine()
        println()
        return num.toInt()
    }

    companion object {

        private const val DELIMITER = ","
        private const val PRINT_INPUT_MONEY = "구입금액을 입력해 주세요."
        private const val PRINT_INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요."
        private const val PRINT_INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요."

    }
}