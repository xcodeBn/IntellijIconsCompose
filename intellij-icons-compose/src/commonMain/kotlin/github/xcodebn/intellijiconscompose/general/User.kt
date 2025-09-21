package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val User: ImageVector
    get() {
        if (_User != null) return _User!!

        _User = ImageVector.Builder(
            name = "User",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8f)
                curveTo(9.93f, 8.00f, 11.50f, 6.43f, 11.50f, 4.50f)
                curveTo(11.50f, 2.57f, 9.93f, 1.00f, 8.00f, 1.00f)
                curveTo(6.07f, 1.00f, 4.50f, 2.57f, 4.50f, 4.50f)
                curveTo(4.50f, 6.43f, 6.07f, 8.00f, 8.00f, 8.00f)
                close()
                moveTo(8f, 10f)
                curveTo(5.66f, 9.75f, 1.00f, 10.92f, 1.00f, 13.25f)
                lineTo(1f, 15f)
                lineTo(15f, 15f)
                lineTo(15f, 13f)
                curveTo(15.00f, 10.92f, 10.34f, 9.75f, 8.00f, 9.75f)
                close()
            }
        }.build()

        return _User!!
    }

private var _User: ImageVector? = null

