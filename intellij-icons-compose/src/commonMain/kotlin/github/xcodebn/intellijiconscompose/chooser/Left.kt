package github.xcodebn.intellijiconscompose.chooser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Left: ImageVector
    get() {
        if (_Left != null) return _Left!!

        _Left = ImageVector.Builder(
            name = "Left",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(14f, 8f)
                curveTo(13.85f, 8.28f, 13.54f, 8.59f, 13.09f, 8.59f)
                lineTo(6f, 9f)
                lineTo(4f, 9f)
                lineTo(6f, 10f)
                lineTo(7f, 11f)
                curveTo(7.60f, 11.52f, 7.68f, 11.70f, 7.68f, 11.91f)
                curveTo(7.68f, 12.32f, 7.38f, 12.62f, 6.96f, 12.62f)
                curveTo(6.76f, 12.62f, 6.58f, 12.55f, 6.42f, 12.39f)
                lineTo(2f, 8f)
                curveTo(2.25f, 8.24f, 2.17f, 8.05f, 2.17f, 7.84f)
                curveTo(2.17f, 7.63f, 2.25f, 7.44f, 2.41f, 7.28f)
                lineTo(6f, 3f)
                curveTo(6.58f, 3.13f, 6.76f, 3.05f, 6.96f, 3.05f)
                curveTo(7.38f, 3.05f, 7.68f, 3.36f, 7.68f, 3.77f)
                curveTo(7.68f, 3.98f, 7.60f, 4.16f, 7.46f, 4.30f)
                lineTo(6f, 5f)
                lineTo(4f, 7f)
                lineTo(6f, 7f)
                lineTo(13f, 7f)
                curveTo(13.54f, 7.09f, 13.85f, 7.40f, 13.85f, 7.84f)
                close()
            }
        }.build()

        return _Left!!
    }

private var _Left: ImageVector? = null

