package Chapter13.Appendix1.DrumMachine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import javax.sound.sampled.AudioSystem

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )
    clip.open(audioInputStream)
    clip.start()
}


suspend fun main(args: Array<String>) {
    runBlocking {
        launch { playBeats("x-x-x-x-x-x-", "src/main/resources/Drum Machine/toms.aiff") }
        playBeats("x-----x-----", "src/main/resources/Drum Machine/crash_cymbal.aiff")
    }
}