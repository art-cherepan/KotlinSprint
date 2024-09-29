package lesson11.task3

fun main() {
    val participantsForFirstRoom = mutableListOf(
        Participant("John", Status.MICROPHONE_IS_TURNED_OFF),
        Participant("Nick", Status.MICROPHONE_IS_TURNED_OFF),
        Participant("Sam", Status.SPEAK),
    )

    val participantsForSecondRoom = mutableListOf(
        Participant("Harry", Status.MICROPHONE_IS_TURNED_OFF),
        Participant("Maggy", Status.MICROPHONE_IS_TURNED_OFF),
        Participant("Bill", Status.SPEAK),
    )

    val firstRoom = Room (
        "Cover of first room",
        "Name of first room",
        participantsForFirstRoom,
    )

    val secondRoom = Room (
        "Cover of second room",
        "Name of second room",
        participantsForSecondRoom,
    )

    println("Первая комната:")
    firstRoom.getParticipants().forEach { println("Nickname: ${it.getNickName()} -> Status: ${it.getStatus()}") }

    println("Вторая комната:")
    secondRoom.getParticipants().forEach { println("Nickname: ${it.getNickName()} -> Status: ${it.getStatus()}") }

    firstRoom.addParticipant(
        Participant(
            "Vicky",
            Status.MICROPHONE_IS_TURNED_OFF,
        )
    )

    firstRoom.changeStatus("John", Status.USER_IS_MUTED)

    println("И снова первая комната:")
    firstRoom.getParticipants().forEach { println("Nickname: ${it.getNickName()} -> Status: ${it.getStatus()}") }
}

class Room (
    private val cover: String,
    private val name: String,
    private val participants: MutableList<Participant>,
) {
    fun getParticipants(): MutableList<Participant> {
        return participants
    }

    fun getCover(): String {
        return cover
    }

    fun getName(): String {
        return name
    }

    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun changeStatus(nickName: String, newStatus: Status) {
        for (participant in participants) {
            if (participant.getNickName() == nickName) {
                participant.changeStatus(newStatus)
            }
        }
    }
}

class Participant (
    private val nickName: String,
    private var status: Status,
) {
    fun changeStatus(newStatus: Status) {
        status = newStatus
    }

    fun getStatus(): Status {
        return status
    }

    fun getNickName(): String {
        return nickName
    }
}

enum class Status(val status: String) {
    SPEAK("Разговаривает"),
    MICROPHONE_IS_TURNED_OFF("Микрофон выключен"),
    USER_IS_MUTED("Пользователь заглушен"),
}