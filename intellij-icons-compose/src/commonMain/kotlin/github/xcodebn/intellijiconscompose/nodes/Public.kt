package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Public: ImageVector
    get() {
        if (_Public != null) return _Public!!

        _Public = ImageVector.Builder(
            name = "Public",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 7f)
                curveTo(7.00f, 6.45f, 7.00f, 6.02f, 7.00f, 5.69f)
                curveTo(7.00f, 4.90f, 6.64f, 4.00f, 5.00f, 4.00f)
                curveTo(3.36f, 4.00f, 3.01f, 5.00f, 3.01f, 6.00f)
                curveTo(3.01f, 7.00f, 3.00f, 7.68f, 3.00f, 8.00f)
                lineTo(4f, 8f)
                lineTo(4f, 6f)
                curveTo(4.00f, 5.00f, 4.41f, 5.00f, 5.00f, 5.00f)
                curveTo(5.59f, 5.00f, 6.00f, 5.00f, 6.00f, 6.00f)
                lineTo(6f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 12f)
                lineTo(11f, 12f)
                lineTo(11f, 7f)
                lineTo(7f, 7f)
                close()
            }
        }.build()

        return _Public!!
    }

private var _Public: ImageVector? = null

