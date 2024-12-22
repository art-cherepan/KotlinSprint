package lesson22.task4

fun main() {
    val mainScreenViewModel = MainScreenViewModel(
        mainScreenState = MainScreenState(
            data = "",
        )
    )

    mainScreenViewModel.loadData()
}

class MainScreenViewModel(
    private var mainScreenState: MainScreenState,
) {
    fun loadData() {
        mainScreenState = MainScreenState(
            data = "",
            isLoading = false,
        )

        var newMainScreenState = mainScreenState.copy(data = "Загружаемые данные")
        mainScreenState = newMainScreenState

        newMainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = newMainScreenState
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)