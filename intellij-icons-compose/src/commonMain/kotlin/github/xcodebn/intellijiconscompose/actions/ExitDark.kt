package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExitDark: ImageVector
    get() {
        if (_ExitDark != null) return _ExitDark!!

        _ExitDark = ImageVector.Builder(
            name = "ExitDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 5f)
                lineTo(3f, 5f)
                lineTo(3f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 11f)
                close()
                moveTo(5f, 3f)
                lineTo(5f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 3f)
                lineTo(5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(7f, 9f)
                lineTo(10f, 9f)
                lineTo(6f, 13f)
                lineTo(2f, 9f)
                lineTo(5f, 9f)
                lineTo(5f, 3f)
                lineTo(7f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 11f)
                    lineTo(5f, 11f)
                    lineTo(5f, 5f)
                    lineTo(3f, 5f)
                    lineTo(3f, 1f)
                    lineTo(15f, 1f)
                    lineTo(15f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 11f)
                    close()
                    moveTo(5f, 3f)
                    lineTo(5f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 3f)
                    lineTo(5f, 3f)
                    close()
                }
            }
        }.build()

        return _ExitDark!!
    }

private var _ExitDark: ImageVector? = null

