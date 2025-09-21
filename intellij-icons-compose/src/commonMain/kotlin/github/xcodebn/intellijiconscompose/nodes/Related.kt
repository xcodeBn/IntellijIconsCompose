package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Related: ImageVector
    get() {
        if (_Related != null) return _Related!!

        _Related = ImageVector.Builder(
            name = "Related",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6f)
                lineTo(6f, 7f)
                lineTo(4f, 8f)
                curveTo(3.12f, 9.27f, 3.12f, 10.89f, 4.12f, 11.88f)
                curveTo(5.11f, 12.88f, 6.73f, 12.88f, 7.72f, 11.88f)
                lineTo(9f, 10f)
                lineTo(10f, 11f)
                lineTo(9f, 13f)
                curveTo(7.16f, 14.38f, 4.68f, 14.38f, 3.15f, 12.85f)
                curveTo(1.62f, 11.32f, 1.62f, 8.84f, 3.15f, 7.31f)
                lineTo(5f, 6f)
                close()
                moveTo(6f, 5f)
                lineTo(7f, 3f)
                curveTo(8.84f, 1.62f, 11.32f, 1.62f, 12.85f, 3.15f)
                curveTo(14.38f, 4.68f, 14.38f, 7.16f, 12.85f, 8.69f)
                lineTo(11f, 10f)
                lineTo(10f, 9f)
                lineTo(12f, 8f)
                curveTo(12.88f, 6.73f, 12.88f, 5.11f, 11.88f, 4.12f)
                curveTo(10.89f, 3.12f, 9.27f, 3.12f, 8.28f, 4.12f)
                lineTo(7f, 6f)
                lineTo(6f, 5f)
                close()
                moveTo(5f, 9f)
                lineTo(9f, 6f)
                lineTo(11f, 7f)
                lineTo(7f, 11f)
                lineTo(5f, 9f)
                close()
            }
        }.build()

        return _Related!!
    }

private var _Related: ImageVector? = null

