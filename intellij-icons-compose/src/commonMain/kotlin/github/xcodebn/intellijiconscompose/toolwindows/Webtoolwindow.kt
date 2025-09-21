package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Webtoolwindow: ImageVector
    get() {
        if (_Webtoolwindow != null) return _Webtoolwindow!!

        _Webtoolwindow = ImageVector.Builder(
            name = "Webtoolwindow",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 1f)
                curveTo(3.36f, 0.81f, 0.81f, 3.36f, 0.81f, 6.50f)
                curveTo(0.81f, 9.64f, 3.36f, 12.19f, 6.50f, 12.19f)
                curveTo(9.64f, 12.19f, 12.19f, 9.64f, 12.19f, 6.50f)
                curveTo(12.19f, 3.36f, 9.64f, 0.81f, 6.50f, 0.81f)
                close()
                moveTo(6f, 11f)
                curveTo(3.68f, 10.73f, 1.95f, 8.82f, 1.95f, 6.50f)
                curveTo(1.95f, 6.15f, 2.00f, 5.81f, 2.07f, 5.48f)
                lineTo(5f, 8f)
                lineTo(5f, 9f)
                curveTo(4.79f, 9.40f, 5.31f, 9.91f, 5.93f, 9.91f)
                lineTo(6f, 11f)
                close()
                moveTo(10f, 10f)
                curveTo(9.71f, 9.10f, 9.29f, 8.78f, 8.78f, 8.78f)
                lineTo(8f, 9f)
                lineTo(8f, 7f)
                curveTo(8.21f, 6.76f, 7.95f, 6.50f, 7.64f, 6.50f)
                lineTo(4f, 6f)
                lineTo(4f, 5f)
                lineTo(5f, 5f)
                curveTo(5.68f, 5.36f, 5.93f, 5.11f, 5.93f, 4.79f)
                lineTo(6f, 4f)
                lineTo(7f, 4f)
                curveTo(7.69f, 3.66f, 8.21f, 3.14f, 8.21f, 2.52f)
                lineTo(8f, 2f)
                curveTo(9.87f, 2.96f, 11.05f, 4.59f, 11.05f, 6.50f)
                curveTo(11.05f, 7.68f, 10.60f, 8.76f, 9.86f, 9.57f)
                close()
            }
        }.build()

        return _Webtoolwindow!!
    }

private var _Webtoolwindow: ImageVector? = null

