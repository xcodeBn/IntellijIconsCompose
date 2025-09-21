package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlayglobe: ImageVector
    get() {
        if (_Inlayglobe != null) return _Inlayglobe!!

        _Inlayglobe = ImageVector.Builder(
            name = "Inlayglobe",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                curveTo(3.10f, 0.75f, 0.75f, 3.10f, 0.75f, 6.00f)
                curveTo(0.75f, 8.90f, 3.10f, 11.25f, 6.00f, 11.25f)
                curveTo(8.90f, 11.25f, 11.25f, 8.90f, 11.25f, 6.00f)
                curveTo(11.25f, 3.10f, 8.90f, 0.75f, 6.00f, 0.75f)
                close()
                moveTo(5f, 10f)
                curveTo(3.40f, 9.91f, 1.80f, 8.14f, 1.80f, 6.00f)
                curveTo(1.80f, 5.67f, 1.84f, 5.36f, 1.91f, 5.06f)
                lineTo(4f, 8f)
                verticalLineTo(8f)
                curveTo(4.42f, 8.68f, 4.90f, 9.15f, 5.47f, 9.15f)
                verticalLineTo(10f)
                close()
                moveTo(9f, 9f)
                curveTo(8.96f, 8.40f, 8.57f, 8.10f, 8.10f, 8.10f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                curveTo(7.58f, 6.24f, 7.34f, 6.00f, 7.05f, 6.00f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                curveTo(5.24f, 4.95f, 5.47f, 4.71f, 5.47f, 4.42f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                curveTo(7.10f, 3.38f, 7.58f, 2.90f, 7.58f, 2.33f)
                verticalLineTo(2f)
                curveTo(9.11f, 2.73f, 10.20f, 4.24f, 10.20f, 6.00f)
                curveTo(10.20f, 7.09f, 9.78f, 8.08f, 9.10f, 8.83f)
                close()
            }
        }.build()

        return _Inlayglobe!!
    }

private var _Inlayglobe: ImageVector? = null

