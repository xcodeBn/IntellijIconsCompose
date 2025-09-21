package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ResetDark: ImageVector
    get() {
        if (_ResetDark != null) return _ResetDark!!

        _ResetDark = ImageVector.Builder(
            name = "ResetDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11f)
                lineTo(8f, 11f)
                curveTo(9.66f, 11.00f, 11.00f, 9.66f, 11.00f, 8.00f)
                curveTo(11.00f, 6.34f, 9.66f, 5.00f, 8.00f, 5.00f)
                lineTo(4f, 5f)
                lineTo(4f, 3f)
                lineTo(8f, 3f)
                curveTo(10.76f, 3.00f, 13.00f, 5.24f, 13.00f, 8.00f)
                curveTo(13.00f, 10.76f, 10.76f, 13.00f, 8.00f, 13.00f)
                lineTo(4f, 13f)
                lineTo(4f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(4f, 4f)
                lineTo(0f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 11f)
                    lineTo(8f, 11f)
                    curveTo(9.66f, 11.00f, 11.00f, 9.66f, 11.00f, 8.00f)
                    curveTo(11.00f, 6.34f, 9.66f, 5.00f, 8.00f, 5.00f)
                    lineTo(4f, 5f)
                    lineTo(4f, 3f)
                    lineTo(8f, 3f)
                    curveTo(10.76f, 3.00f, 13.00f, 5.24f, 13.00f, 8.00f)
                    curveTo(13.00f, 10.76f, 10.76f, 13.00f, 8.00f, 13.00f)
                    lineTo(4f, 13f)
                    lineTo(4f, 11f)
                    close()
                }
            }
        }.build()

        return _ResetDark!!
    }

private var _ResetDark: ImageVector? = null

