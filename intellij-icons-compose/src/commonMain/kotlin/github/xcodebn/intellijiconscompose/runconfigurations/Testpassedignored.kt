package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testpassedignored: ImageVector
    get() {
        if (_Testpassedignored != null) return _Testpassedignored!!

        _Testpassedignored = ImageVector.Builder(
            name = "Testpassedignored",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 13f)
                lineTo(7f, 13f)
                lineTo(2f, 8f)
                lineTo(4f, 6f)
                lineTo(7f, 9f)
                lineTo(13f, 3f)
                lineTo(15f, 5f)
                lineTo(12f, 8f)
                curveTo(11.87f, 7.76f, 11.69f, 7.75f, 11.50f, 7.75f)
                curveTo(9.15f, 7.75f, 7.25f, 9.65f, 7.25f, 12.00f)
                curveTo(7.25f, 12.19f, 7.26f, 12.37f, 7.29f, 12.55f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 15f)
                curveTo(13.29f, 15.25f, 14.75f, 13.79f, 14.75f, 12.00f)
                curveTo(14.75f, 10.21f, 13.29f, 8.75f, 11.50f, 8.75f)
                curveTo(9.71f, 8.75f, 8.25f, 10.21f, 8.25f, 12.00f)
                curveTo(8.25f, 13.79f, 9.71f, 15.25f, 11.50f, 15.25f)
                close()
                moveTo(12f, 14f)
                curveTo(12.67f, 14.12f, 13.62f, 13.17f, 13.62f, 12.00f)
                curveTo(13.62f, 11.62f, 13.53f, 11.27f, 13.35f, 10.96f)
                lineTo(10f, 14f)
                curveTo(10.77f, 14.03f, 11.12f, 14.12f, 11.50f, 14.12f)
                close()
                moveTo(10f, 13f)
                lineTo(13f, 10f)
                curveTo(12.23f, 9.97f, 11.88f, 9.88f, 11.50f, 9.88f)
                curveTo(10.33f, 9.88f, 9.38f, 10.83f, 9.38f, 12.00f)
                curveTo(9.38f, 12.38f, 9.47f, 12.73f, 9.65f, 13.04f)
                close()
            }
        }.build()

        return _Testpassedignored!!
    }

private var _Testpassedignored: ImageVector? = null

