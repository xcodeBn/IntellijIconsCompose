package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FrameDark: ImageVector
    get() {
        if (_FrameDark != null) return _FrameDark!!

        _FrameDark = ImageVector.Builder(
            name = "FrameDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 14f)
                lineTo(5f, 14f)
                lineTo(5f, 4f)
                close()
                moveTo(7f, 6f)
                lineTo(7f, 12f)
                lineTo(13f, 12f)
                lineTo(13f, 6f)
                lineTo(7f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(12f, 3f)
                lineTo(4f, 3f)
                lineTo(4f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 1f)
                lineTo(12f, 1f)
                lineTo(12f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(5f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 14f)
                    lineTo(5f, 14f)
                    lineTo(5f, 4f)
                    close()
                    moveTo(7f, 6f)
                    lineTo(7f, 12f)
                    lineTo(13f, 12f)
                    lineTo(13f, 6f)
                    lineTo(7f, 6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(12f, 3f)
                    lineTo(4f, 3f)
                    lineTo(4f, 11f)
                    lineTo(2f, 11f)
                    lineTo(2f, 1f)
                    lineTo(12f, 1f)
                    lineTo(12f, 3f)
                    close()
                }
            }
        }.build()

        return _FrameDark!!
    }

private var _FrameDark: ImageVector? = null

