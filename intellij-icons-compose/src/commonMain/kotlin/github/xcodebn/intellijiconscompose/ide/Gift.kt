package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!

        _Gift = ImageVector.Builder(
            name = "Gift",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(10f, 5f)
                curveTo(11.35f, 5.00f, 12.59f, 4.02f, 12.30f, 2.74f)
                curveTo(12.13f, 2.00f, 11.44f, 1.39f, 10.60f, 1.25f)
                curveTo(9.42f, 1.04f, 8.01f, 1.81f, 8.01f, 3.11f)
                curveTo(8.01f, 1.81f, 6.59f, 1.04f, 5.42f, 1.25f)
                curveTo(4.58f, 1.39f, 3.88f, 2.00f, 3.72f, 2.74f)
                curveTo(3.42f, 4.02f, 4.66f, 5.00f, 5.84f, 5.00f)
                horizontalLineTo(10f)
                close()
                moveTo(7f, 4f)
                horizontalLineTo(6f)
                curveTo(5.00f, 4.05f, 4.35f, 3.07f, 5.07f, 2.44f)
                curveTo(5.68f, 1.91f, 6.92f, 2.19f, 6.92f, 3.11f)
                verticalLineTo(4f)
                close()
                moveTo(9f, 3f)
                curveTo(9.09f, 2.19f, 10.34f, 1.91f, 10.94f, 2.44f)
                curveTo(11.67f, 3.07f, 11.01f, 4.05f, 10.17f, 4.05f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(8f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(2f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Gift!!
    }

private var _Gift: ImageVector? = null

