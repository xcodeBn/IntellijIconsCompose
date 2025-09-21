package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Remote: ImageVector
    get() {
        if (_Remote != null) return _Remote!!

        _Remote = ImageVector.Builder(
            name = "Remote",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(4f, 3f)
                lineTo(4f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 3f)
                lineTo(4f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(13f, 10f)
                lineTo(13f, 9f)
                lineTo(14f, 9f)
                lineTo(14f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 10f)
                lineTo(13f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(11f, 9f)
                lineTo(11f, 12f)
                lineTo(3f, 12f)
                lineTo(3f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 7f)
                lineTo(9f, 4f)
                lineTo(9f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(4f, 8f)
                lineTo(4f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(4f, 3f)
                    lineTo(4f, 5f)
                    lineTo(2f, 5f)
                    lineTo(2f, 13f)
                    lineTo(12f, 13f)
                    lineTo(12f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 14f)
                    lineTo(1f, 14f)
                    lineTo(1f, 3f)
                    lineTo(4f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(13f, 10f)
                    lineTo(13f, 9f)
                    lineTo(14f, 9f)
                    lineTo(14f, 3f)
                    lineTo(6f, 3f)
                    lineTo(6f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 1f)
                    lineTo(15f, 1f)
                    lineTo(15f, 10f)
                    lineTo(13f, 10f)
                    close()
                }
            }
        }.build()

        return _Remote!!
    }

private var _Remote: ImageVector? = null

