package github.xcodebn.intellijiconscompose.chooser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Right: ImageVector
    get() {
        if (_Right != null) return _Right!!

        _Right = ImageVector.Builder(
            name = "Right",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 8f)
                curveTo(2.17f, 7.40f, 2.47f, 7.09f, 2.92f, 7.09f)
                lineTo(10f, 7f)
                lineTo(12f, 7f)
                lineTo(10f, 5f)
                lineTo(9f, 4f)
                curveTo(8.41f, 4.16f, 8.33f, 3.98f, 8.33f, 3.77f)
                curveTo(8.33f, 3.36f, 8.63f, 3.05f, 9.05f, 3.05f)
                curveTo(9.25f, 3.05f, 9.43f, 3.12f, 9.59f, 3.29f)
                lineTo(14f, 7f)
                curveTo(13.76f, 7.44f, 13.85f, 7.63f, 13.85f, 7.84f)
                curveTo(13.85f, 8.05f, 13.76f, 8.24f, 13.60f, 8.40f)
                lineTo(10f, 12f)
                curveTo(9.43f, 12.55f, 9.25f, 12.62f, 9.05f, 12.62f)
                curveTo(8.63f, 12.62f, 8.33f, 12.32f, 8.33f, 11.91f)
                curveTo(8.33f, 11.70f, 8.41f, 11.52f, 8.55f, 11.38f)
                lineTo(10f, 10f)
                lineTo(12f, 9f)
                lineTo(10f, 9f)
                lineTo(3f, 9f)
                curveTo(2.47f, 8.59f, 2.17f, 8.28f, 2.17f, 7.84f)
                close()
            }
        }.build()

        return _Right!!
    }

private var _Right: ImageVector? = null

