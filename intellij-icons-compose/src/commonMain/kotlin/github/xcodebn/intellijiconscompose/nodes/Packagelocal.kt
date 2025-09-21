package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Packagelocal: ImageVector
    get() {
        if (_Packagelocal != null) return _Packagelocal!!

        _Packagelocal = ImageVector.Builder(
            name = "Packagelocal",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(7.38f, 9.13f, 6.87f, 8.62f, 6.87f, 8.00f)
                curveTo(6.87f, 7.38f, 7.38f, 6.87f, 8.00f, 6.87f)
                curveTo(8.62f, 6.87f, 9.13f, 7.38f, 9.13f, 8.00f)
                curveTo(9.13f, 8.62f, 8.62f, 9.13f, 8.00f, 9.13f)
                moveTo(8f, 5f)
                curveTo(6.62f, 5.50f, 5.50f, 6.62f, 5.50f, 8.00f)
                curveTo(5.50f, 9.38f, 6.62f, 10.50f, 8.00f, 10.50f)
                curveTo(9.38f, 10.50f, 10.50f, 9.38f, 10.50f, 8.00f)
                curveTo(10.50f, 6.62f, 9.38f, 5.50f, 8.00f, 5.50f)
            }
        }.build()

        return _Packagelocal!!
    }

private var _Packagelocal: ImageVector? = null

