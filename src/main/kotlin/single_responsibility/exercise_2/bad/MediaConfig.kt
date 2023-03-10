package single_responsibility.exercise_2.bad

class MediaConfig(
    val title: String,
    val imageHeight: Int,
    val imageWidth: Int,
    val imageFormat: ImageFormat,
    val imageResolution: Int, val fps: Int,
    val videoFormat: VideoFormat,
    val videoDuration: Int,
    val audioDuration: Int,
    val audioFormat: AudioFormat
)