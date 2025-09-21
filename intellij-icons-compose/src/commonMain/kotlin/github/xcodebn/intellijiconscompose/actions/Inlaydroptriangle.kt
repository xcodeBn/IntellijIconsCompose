package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlaydroptriangle: ImageVector
    get() {
        if (_Inlaydroptriangle != null) return _Inlaydroptriangle!!

        _Inlaydroptriangle = ImageVector.Builder(
            name = "Inlaydroptriangle",
            defaultWidth = 9.0.dp,
            defaultHeight = 5.0.dp,
            viewportWidth = 9.0f,
            viewportHeight = 5.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 0f)
                curveTo(1.28f, 0.03f, 1.72f, 0.03f, 2.00f, 0.31f)
                lineTo(5f, 3f)
                lineTo(7f, 0f)
                curveTo(7.28f, 0.03f, 7.72f, 0.03f, 8.00f, 0.31f)
                curveTo(8.27f, 0.58f, 8.27f, 1.02f, 8.00f, 1.29f)
                lineTo(5f, 5f)
                lineTo(1f, 1f)
                curveTo(0.73f, 1.02f, 0.73f, 0.58f, 1.01f, 0.31f)
                close()
            }
        }.build()

        return _Inlaydroptriangle!!
    }

private var _Inlaydroptriangle: ImageVector? = null

