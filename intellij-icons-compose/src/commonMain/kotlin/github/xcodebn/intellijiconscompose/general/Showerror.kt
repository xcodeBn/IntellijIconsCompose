package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showerror: ImageVector
    get() {
        if (_Showerror != null) return _Showerror!!

        _Showerror = ImageVector.Builder(
            name = "Showerror",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(4.13f, 1.00f, 1.00f, 4.13f, 1.00f, 8.00f)
                curveTo(1.00f, 11.87f, 4.13f, 15.00f, 8.00f, 15.00f)
                curveTo(11.87f, 15.00f, 15.00f, 11.87f, 15.00f, 8.00f)
                curveTo(15.00f, 4.13f, 11.87f, 1.00f, 8.00f, 1.00f)
                close()
                moveTo(7f, 12f)
                lineTo(7f, 7f)
                lineTo(9f, 7f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 4f)
                lineTo(7f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 4f)
                lineTo(7f, 4f)
                close()
            }
        }.build()

        return _Showerror!!
    }

private var _Showerror: ImageVector? = null

