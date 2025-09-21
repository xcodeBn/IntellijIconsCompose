package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Oracle: ImageVector
    get() {
        if (_Oracle != null) return _Oracle!!

        _Oracle = ImageVector.Builder(
            name = "Oracle",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(5f, 11f)
                curveTo(2.70f, 11.00f, 1.00f, 9.21f, 1.00f, 7.00f)
                curveTo(1.00f, 4.79f, 2.70f, 3.00f, 4.79f, 3.00f)
                lineTo(9f, 3f)
                curveTo(11.30f, 3.00f, 13.00f, 4.79f, 13.00f, 7.00f)
                curveTo(13.00f, 9.21f, 11.30f, 11.00f, 9.21f, 11.00f)
                lineTo(5f, 11f)
                close()
                moveTo(9f, 10f)
                curveTo(10.46f, 9.59f, 11.56f, 8.43f, 11.56f, 7.00f)
                curveTo(11.56f, 5.57f, 10.46f, 4.41f, 9.11f, 4.41f)
                lineTo(5f, 4f)
                curveTo(3.54f, 4.41f, 2.44f, 5.57f, 2.44f, 7.00f)
                curveTo(2.44f, 8.43f, 3.54f, 9.59f, 4.89f, 9.59f)
                lineTo(9f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(5f, 11f)
                    curveTo(2.70f, 11.00f, 1.00f, 9.21f, 1.00f, 7.00f)
                    curveTo(1.00f, 4.79f, 2.70f, 3.00f, 4.79f, 3.00f)
                    lineTo(9f, 3f)
                    curveTo(11.30f, 3.00f, 13.00f, 4.79f, 13.00f, 7.00f)
                    curveTo(13.00f, 9.21f, 11.30f, 11.00f, 9.21f, 11.00f)
                    lineTo(5f, 11f)
                    close()
                    moveTo(9f, 10f)
                    curveTo(10.46f, 9.59f, 11.56f, 8.43f, 11.56f, 7.00f)
                    curveTo(11.56f, 5.57f, 10.46f, 4.41f, 9.11f, 4.41f)
                    lineTo(5f, 4f)
                    curveTo(3.54f, 4.41f, 2.44f, 5.57f, 2.44f, 7.00f)
                    curveTo(2.44f, 8.43f, 3.54f, 9.59f, 4.89f, 9.59f)
                    lineTo(9f, 10f)
                    close()
                }
            }
        }.build()

        return _Oracle!!
    }

private var _Oracle: ImageVector? = null

