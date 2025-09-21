package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowcommit: ImageVector
    get() {
        if (_Toolwindowcommit != null) return _Toolwindowcommit!!

        _Toolwindowcommit = ImageVector.Builder(
            name = "Toolwindowcommit",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                curveTo(8.36f, 10.00f, 9.93f, 8.73f, 10.37f, 7.00f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                curveTo(9.93f, 3.27f, 8.36f, 2.00f, 6.50f, 2.00f)
                curveTo(4.64f, 2.00f, 3.07f, 3.27f, 2.63f, 5.00f)
                lineTo(0f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                curveTo(3.07f, 8.73f, 4.64f, 10.00f, 6.50f, 10.00f)
                close()
                moveTo(8f, 6f)
                curveTo(8.50f, 7.10f, 7.60f, 8.00f, 6.50f, 8.00f)
                curveTo(5.40f, 8.00f, 4.50f, 7.10f, 4.50f, 6.00f)
                curveTo(4.50f, 4.90f, 5.40f, 4.00f, 6.50f, 4.00f)
                curveTo(7.60f, 4.00f, 8.50f, 4.90f, 8.50f, 6.00f)
                close()
            }
        }.build()

        return _Toolwindowcommit!!
    }

private var _Toolwindowcommit: ImageVector? = null

