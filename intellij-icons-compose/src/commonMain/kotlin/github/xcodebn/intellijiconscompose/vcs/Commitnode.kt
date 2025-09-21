package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Commitnode: ImageVector
    get() {
        if (_Commitnode != null) return _Commitnode!!

        _Commitnode = ImageVector.Builder(
            name = "Commitnode",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 12f)
                curveTo(5.27f, 11.43f, 4.00f, 9.86f, 4.00f, 8.00f)
                curveTo(4.00f, 6.14f, 5.27f, 4.57f, 7.00f, 4.13f)
                lineTo(7f, 1f)
                lineTo(9f, 1f)
                lineTo(9f, 4f)
                curveTo(10.73f, 4.57f, 12.00f, 6.14f, 12.00f, 8.00f)
                curveTo(12.00f, 9.86f, 10.73f, 11.43f, 9.00f, 11.87f)
                lineTo(9f, 15f)
                lineTo(7f, 15f)
                lineTo(7f, 12f)
                close()
                moveTo(8f, 10f)
                curveTo(9.10f, 10.00f, 10.00f, 9.10f, 10.00f, 8.00f)
                curveTo(10.00f, 6.90f, 9.10f, 6.00f, 8.00f, 6.00f)
                curveTo(6.90f, 6.00f, 6.00f, 6.90f, 6.00f, 8.00f)
                curveTo(6.00f, 9.10f, 6.90f, 10.00f, 8.00f, 10.00f)
                close()
            }
        }.build()

        return _Commitnode!!
    }

private var _Commitnode: ImageVector? = null

