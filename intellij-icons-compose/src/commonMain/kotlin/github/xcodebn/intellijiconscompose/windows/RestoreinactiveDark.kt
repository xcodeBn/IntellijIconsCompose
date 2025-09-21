package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RestoreinactiveDark: ImageVector
    get() {
        if (_RestoreinactiveDark != null) return _RestoreinactiveDark!!

        _RestoreinactiveDark = ImageVector.Builder(
            name = "RestoreinactiveDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF8C8C8C))
            ) {
                moveTo(5f, 8f)
                lineTo(5f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 8f)
                lineTo(5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8C8C8C))
            ) {
                moveTo(0f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 1f)
                lineTo(1f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 1f)
                lineTo(1f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF8C8C8C))
                ) {
                    moveTo(5f, 8f)
                    lineTo(5f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 1f)
                    lineTo(1f, 1f)
                    lineTo(1f, 3f)
                    lineTo(0f, 3f)
                    lineTo(0f, 0f)
                    lineTo(8f, 0f)
                    lineTo(8f, 8f)
                    lineTo(5f, 8f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF8C8C8C))
                ) {
                    moveTo(0f, 0f)
                    lineTo(8f, 0f)
                    lineTo(8f, 8f)
                    lineTo(0f, 8f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 1f)
                    lineTo(1f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 1f)
                    lineTo(1f, 1f)
                    close()
                }
            }
        }.build()

        return _RestoreinactiveDark!!
    }

private var _RestoreinactiveDark: ImageVector? = null

