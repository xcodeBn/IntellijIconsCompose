package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UnshelvesilentDark: ImageVector
    get() {
        if (_UnshelvesilentDark != null) return _UnshelvesilentDark!!

        _UnshelvesilentDark = ImageVector.Builder(
            name = "UnshelvesilentDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(9f, 7f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                lineTo(4f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 7f)
                close()
            }
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
            group() {
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(9f, 7f)
                    lineTo(12f, 7f)
                    lineTo(8f, 11f)
                    lineTo(4f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 2f)
                    lineTo(9f, 2f)
                    lineTo(9f, 7f)
                    close()
                }
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
            }
        }.build()

        return _UnshelvesilentDark!!
    }

private var _UnshelvesilentDark: ImageVector? = null

