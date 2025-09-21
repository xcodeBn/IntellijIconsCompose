package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ResetviewDark: ImageVector
    get() {
        if (_ResetviewDark != null) return _ResetviewDark!!

        _ResetviewDark = ImageVector.Builder(
            name = "ResetviewDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 2f)
                curveTo(7.21f, 2.00f, 6.42f, 2.15f, 5.68f, 2.45f)
                curveTo(4.95f, 2.75f, 4.28f, 3.20f, 3.72f, 3.76f)
                lineTo(2f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                lineTo(5f, 5f)
                curveTo(5.52f, 4.81f, 5.96f, 4.51f, 6.45f, 4.30f)
                curveTo(6.94f, 4.10f, 7.47f, 4.00f, 8.00f, 4.00f)
                curveTo(8.74f, 4.00f, 9.46f, 4.20f, 10.09f, 4.59f)
                curveTo(10.72f, 4.97f, 11.23f, 5.52f, 11.56f, 6.18f)
                curveTo(11.90f, 6.84f, 12.04f, 7.57f, 11.99f, 8.31f)
                curveTo(11.93f, 9.04f, 11.67f, 9.75f, 11.24f, 10.35f)
                curveTo(10.81f, 10.94f, 10.22f, 11.41f, 9.54f, 11.69f)
                curveTo(8.86f, 11.98f, 8.11f, 12.07f, 7.38f, 11.95f)
                curveTo(6.66f, 11.84f, 5.97f, 11.53f, 5.41f, 11.05f)
                curveTo(4.85f, 10.57f, 4.43f, 9.95f, 4.20f, 9.25f)
                lineTo(2f, 10f)
                curveTo(2.64f, 10.92f, 3.27f, 11.86f, 4.12f, 12.57f)
                curveTo(4.96f, 13.29f, 5.98f, 13.76f, 7.08f, 13.93f)
                curveTo(8.17f, 14.10f, 9.29f, 13.96f, 10.31f, 13.54f)
                curveTo(11.33f, 13.11f, 12.21f, 12.42f, 12.86f, 11.52f)
                curveTo(13.51f, 10.62f, 13.90f, 9.57f, 13.98f, 8.46f)
                curveTo(14.07f, 7.36f, 13.85f, 6.26f, 13.34f, 5.27f)
                curveTo(12.84f, 4.29f, 12.08f, 3.46f, 11.13f, 2.88f)
                curveTo(10.19f, 2.31f, 9.11f, 2.00f, 8.00f, 2.00f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _ResetviewDark!!
    }

private var _ResetviewDark: ImageVector? = null

