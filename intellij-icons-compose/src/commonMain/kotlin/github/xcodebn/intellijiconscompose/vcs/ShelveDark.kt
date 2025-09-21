package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShelveDark: ImageVector
    get() {
        if (_ShelveDark != null) return _ShelveDark!!

        _ShelveDark = ImageVector.Builder(
            name = "ShelveDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 10f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 15f)
                lineTo(1f, 15f)
                lineTo(1f, 10f)
                lineTo(3f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(9f, 7f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                lineTo(4f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 10f)
                    lineTo(3f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 10f)
                    lineTo(15f, 10f)
                    lineTo(15f, 15f)
                    lineTo(1f, 15f)
                    lineTo(1f, 10f)
                    lineTo(3f, 10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(9f, 7f)
                    lineTo(12f, 7f)
                    lineTo(8f, 11f)
                    lineTo(4f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 4f)
                    lineTo(9f, 4f)
                    lineTo(9f, 7f)
                    close()
                }
            }
        }.build()

        return _ShelveDark!!
    }

private var _ShelveDark: ImageVector? = null

