package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Anonymousclass: ImageVector
    get() {
        if (_Anonymousclass != null) return _Anonymousclass!!

        _Anonymousclass = ImageVector.Builder(
            name = "Anonymousclass",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 11f)
                curveTo(6.34f, 11.00f, 5.00f, 9.66f, 5.00f, 8.00f)
                curveTo(5.00f, 6.34f, 6.34f, 5.00f, 8.00f, 5.00f)
                curveTo(9.66f, 5.00f, 11.00f, 6.34f, 11.00f, 8.00f)
                curveTo(11.00f, 9.66f, 9.66f, 11.00f, 8.00f, 11.00f)
                moveTo(8f, 1f)
                curveTo(4.13f, 1.00f, 1.00f, 4.13f, 1.00f, 8.00f)
                curveTo(1.00f, 11.87f, 4.13f, 15.00f, 8.00f, 15.00f)
                curveTo(11.87f, 15.00f, 15.00f, 11.87f, 15.00f, 8.00f)
                curveTo(15.00f, 4.13f, 11.87f, 1.00f, 8.00f, 1.00f)
            }
        }.build()

        return _Anonymousclass!!
    }

private var _Anonymousclass: ImageVector? = null

