package github.xcodebn.intellijiconscompose.webreferences

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerDark: ImageVector
    get() {
        if (_ServerDark != null) return _ServerDark!!

        _ServerDark = ImageVector.Builder(
            name = "ServerDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 2f)
                lineTo(13f, 2f)
                close()
                moveTo(4f, 3f)
                lineTo(4f, 4f)
                close()
                moveTo(3f, 6f)
                lineTo(13f, 6f)
                close()
                moveTo(4f, 7f)
                lineTo(4f, 8f)
                close()
                moveTo(3f, 10f)
                lineTo(13f, 10f)
                close()
                moveTo(4f, 11f)
                lineTo(4f, 12f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 2f)
                    lineTo(13f, 2f)
                    close()
                    moveTo(4f, 3f)
                    lineTo(4f, 4f)
                    close()
                    moveTo(3f, 6f)
                    lineTo(13f, 6f)
                    close()
                    moveTo(4f, 7f)
                    lineTo(4f, 8f)
                    close()
                    moveTo(3f, 10f)
                    lineTo(13f, 10f)
                    close()
                    moveTo(4f, 11f)
                    lineTo(4f, 12f)
                    close()
                }
            }
        }.build()

        return _ServerDark!!
    }

private var _ServerDark: ImageVector? = null

