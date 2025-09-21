package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmjoinDark: ImageVector
    get() {
        if (_CwmjoinDark != null) return _CwmjoinDark!!

        _CwmjoinDark = ImageVector.Builder(
            name = "CwmjoinDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 5f)
                curveTo(10.93f, 5.82f, 11.50f, 6.84f, 11.50f, 8.00f)
                curveTo(11.50f, 8.15f, 11.47f, 8.29f, 11.46f, 8.44f)
                curveTo(11.91f, 8.17f, 12.43f, 8.00f, 13.00f, 8.00f)
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 11f)
                verticalLineToRelative(2f)
                curveTo(7.32f, 12.96f, 7.66f, 13.00f, 8.00f, 13.00f)
                curveTo(8.86f, 13.00f, 9.65f, 12.77f, 10.36f, 12.38f)
                curveTo(10.14f, 11.97f, 10.00f, 11.50f, 10.00f, 11.00f)
                close()
                moveTo(5f, 7f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(6f, 10f)
                lineTo(4f, 10f)
                close()
            }
        }.build()

        return _CwmjoinDark!!
    }

private var _CwmjoinDark: ImageVector? = null

