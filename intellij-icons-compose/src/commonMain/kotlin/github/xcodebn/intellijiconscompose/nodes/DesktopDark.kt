package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DesktopDark: ImageVector
    get() {
        if (_DesktopDark != null) return _DesktopDark!!

        _DesktopDark = ImageVector.Builder(
            name = "DesktopDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 3f)
                close()
                moveTo(4f, 5f)
                lineTo(4f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 5f)
                lineTo(4f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(2f, 3f)
                    lineTo(14f, 3f)
                    lineTo(14f, 11f)
                    lineTo(2f, 11f)
                    lineTo(2f, 3f)
                    close()
                    moveTo(4f, 5f)
                    lineTo(4f, 9f)
                    lineTo(12f, 9f)
                    lineTo(12f, 5f)
                    lineTo(4f, 5f)
                    close()
                }
            }
        }.build()

        return _DesktopDark!!
    }

private var _DesktopDark: ImageVector? = null

