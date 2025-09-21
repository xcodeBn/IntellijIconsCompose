package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModifierdisabledDark: ImageVector
    get() {
        if (_ModifierdisabledDark != null) return _ModifierdisabledDark!!

        _ModifierdisabledDark = ImageVector.Builder(
            name = "ModifierdisabledDark",
            defaultWidth = 15.0.dp,
            defaultHeight = 15.0.dp,
            viewportWidth = 15.0f,
            viewportHeight = 15.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(3f, 6f)
                lineTo(11f, 6f)
                lineTo(11f, 10f)
                lineTo(3f, 10f)
                close()
            }
        }.build()

        return _ModifierdisabledDark!!
    }

private var _ModifierdisabledDark: ImageVector? = null

