package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmartstepintoDark: ImageVector
    get() {
        if (_SmartstepintoDark != null) return _SmartstepintoDark!!

        _SmartstepintoDark = ImageVector.Builder(
            name = "SmartstepintoDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(12f, 7f)
                lineTo(15f, 7f)
                close()
                moveTo(3f, 1f)
                lineTo(5f, 1f)
                close()
                moveTo(1f, 5f)
                lineTo(7f, 5f)
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(12f, 7f)
                    lineTo(15f, 7f)
                    close()
                    moveTo(3f, 1f)
                    lineTo(5f, 1f)
                    close()
                    moveTo(1f, 5f)
                    lineTo(7f, 5f)
                }
            }
        }.build()

        return _SmartstepintoDark!!
    }

private var _SmartstepintoDark: ImageVector? = null

