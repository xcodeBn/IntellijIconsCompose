package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stopsmallhovered: ImageVector
    get() {
        if (_Stopsmallhovered != null) return _Stopsmallhovered!!

        _Stopsmallhovered = ImageVector.Builder(
            name = "Stopsmallhovered",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                lineTo(6f, 2f)
                lineTo(6f, 2f)
                lineTo(6f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 6f)
                lineTo(6f, 6f)
                close()
                moveTo(6f, 12f)
                curveTo(2.69f, 12.00f, -0.00f, 9.31f, -0.00f, 6.00f)
                curveTo(-0.00f, 2.69f, 2.69f, 0.00f, 6.00f, 0.00f)
                curveTo(9.31f, 0.00f, 12.00f, 2.69f, 12.00f, 6.00f)
                curveTo(12.00f, 9.31f, 9.31f, 12.00f, 6.00f, 12.00f)
                close()
            }
        }.build()

        return _Stopsmallhovered!!
    }

private var _Stopsmallhovered: ImageVector? = null

