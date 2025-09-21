package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Linkdroptriangle: ImageVector
    get() {
        if (_Linkdroptriangle != null) return _Linkdroptriangle!!

        _Linkdroptriangle = ImageVector.Builder(
            name = "Linkdroptriangle",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                curveTo(9.75f, 5.62f, 10.25f, 5.62f, 10.57f, 5.93f)
                curveTo(10.88f, 6.25f, 10.88f, 6.75f, 10.57f, 7.07f)
                lineTo(7f, 11f)
                lineTo(3f, 7f)
                curveTo(3.12f, 6.75f, 3.12f, 6.25f, 3.43f, 5.93f)
                curveTo(3.75f, 5.62f, 4.25f, 5.62f, 4.57f, 5.93f)
                lineTo(7f, 8f)
                lineTo(9f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 6f)
                    curveTo(9.75f, 5.62f, 10.25f, 5.62f, 10.57f, 5.93f)
                    curveTo(10.88f, 6.25f, 10.88f, 6.75f, 10.57f, 7.07f)
                    lineTo(7f, 11f)
                    lineTo(3f, 7f)
                    curveTo(3.12f, 6.75f, 3.12f, 6.25f, 3.43f, 5.93f)
                    curveTo(3.75f, 5.62f, 4.25f, 5.62f, 4.57f, 5.93f)
                    lineTo(7f, 8f)
                    lineTo(9f, 6f)
                    close()
                }
            }
        }.build()

        return _Linkdroptriangle!!
    }

private var _Linkdroptriangle: ImageVector? = null

