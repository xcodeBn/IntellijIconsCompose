package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunAnythingDark: ImageVector
    get() {
        if (_RunAnythingDark != null) return _RunAnythingDark!!

        _RunAnythingDark = ImageVector.Builder(
            name = "RunAnythingDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(0f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 3f)
                lineTo(1f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 3f)
                lineTo(1f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(3f, 4f)
                lineTo(8f, 7f)
                lineTo(3f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(0f, 0f)
                    lineTo(14f, 0f)
                    lineTo(14f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 3f)
                    lineTo(1f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 3f)
                    lineTo(1f, 3f)
                    close()
                }
            }
        }.build()

        return _RunAnythingDark!!
    }

private var _RunAnythingDark: ImageVector? = null

