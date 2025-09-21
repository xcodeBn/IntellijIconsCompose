package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MouseDark: ImageVector
    get() {
        if (_MouseDark != null) return _MouseDark!!

        _MouseDark = ImageVector.Builder(
            name = "MouseDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(13f, 6f)
                curveTo(13.00f, 3.40f, 10.97f, 1.31f, 8.50f, 1.00f)
                close()
                moveTo(3f, 10f)
                curveTo(3.00f, 12.71f, 5.24f, 15.00f, 8.00f, 15.00f)
                curveTo(10.76f, 15.00f, 13.00f, 12.71f, 13.00f, 9.89f)
                lineTo(13f, 7f)
                lineTo(3f, 7f)
                lineTo(3f, 10f)
                close()
                moveTo(8f, 1f)
                curveTo(5.03f, 1.31f, 3.00f, 3.40f, 3.00f, 6.00f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                close()
            }
        }.build()

        return _MouseDark!!
    }

private var _MouseDark: ImageVector? = null

