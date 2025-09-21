package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Applet: ImageVector
    get() {
        if (_Applet != null) return _Applet!!

        _Applet = ImageVector.Builder(
            name = "Applet",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 1f)
                close()
                moveTo(2f, 4f)
                lineTo(2f, 13f)
                lineTo(14f, 13f)
                lineTo(14f, 4f)
                lineTo(2f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(1f, 1f)
                    lineTo(15f, 1f)
                    lineTo(15f, 14f)
                    lineTo(1f, 14f)
                    lineTo(1f, 1f)
                    close()
                    moveTo(2f, 4f)
                    lineTo(2f, 13f)
                    lineTo(14f, 13f)
                    lineTo(14f, 4f)
                    lineTo(2f, 4f)
                    close()
                }
            }
        }.build()

        return _Applet!!
    }

private var _Applet: ImageVector? = null

