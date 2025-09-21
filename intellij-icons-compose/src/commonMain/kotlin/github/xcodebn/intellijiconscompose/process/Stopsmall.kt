package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stopsmall: ImageVector
    get() {
        if (_Stopsmall != null) return _Stopsmall!!

        _Stopsmall = ImageVector.Builder(
            name = "Stopsmall",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8f)
                lineTo(10f, 5f)
                lineTo(8f, 5f)
                lineTo(8f, 8f)
                lineTo(5f, 8f)
                lineTo(5f, 10f)
                lineTo(8f, 10f)
                lineTo(8f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 10f)
                lineTo(13f, 10f)
                lineTo(13f, 8f)
                lineTo(10f, 8f)
                close()
                moveTo(9f, 15f)
                curveTo(5.69f, 15.00f, 3.00f, 12.31f, 3.00f, 9.00f)
                curveTo(3.00f, 5.69f, 5.69f, 3.00f, 9.00f, 3.00f)
                curveTo(12.31f, 3.00f, 15.00f, 5.69f, 15.00f, 9.00f)
                curveTo(15.00f, 12.31f, 12.31f, 15.00f, 9.00f, 15.00f)
                close()
            }
        }.build()

        return _Stopsmall!!
    }

private var _Stopsmall: ImageVector? = null

